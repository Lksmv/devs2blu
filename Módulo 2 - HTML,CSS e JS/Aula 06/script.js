const urlApi = 'http://localhost:3000/pessoas';

const form = document.getElementById('form');
const listaUl = document.getElementById('listaUL');
const btn = document.getElementById('btn');

const iCep = document.getElementById('cep');
const iLogradouro = document.getElementById('logradouro');
const iBairro = document.getElementById('bairro');
const iCidade = document.getElementById('cidade');
const iEstado = document.getElementById('estado');
const iNome = document.getElementById('nome');

let idEditando = null;

// PEGAR DADOS DO CEP
const obterDadosDoCep = async (cep) => {
    const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
    const dados = await resposta.json();
    return dados;
};

// EVENTO CEP
iCep.addEventListener('change', async () => {
    const cep = iCep.value;
    if (cep.length !== 8) return alert('CEP deve conter 8 dígitos');
    
    const dados = await obterDadosDoCep(cep);
    
    iLogradouro.value = dados.logradouro || '';
    iBairro.value = dados.bairro || '';
    iCidade.value = dados.localidade || '';
    iEstado.value = dados.uf || '';
});

// LOAD
const carregar = () => {
    fetch(urlApi)
        .then(res => res.json())
        .then(pessoas => {
            listaUl.innerHTML = '';
            pessoas.forEach(exibir);
        });
};

// EVENTO SUBMIT
form.addEventListener('submit', (e) => {
    e.preventDefault();

    const pessoa = {
        nome: iNome.value,
        cep: iCep.value,
        logradouro: iLogradouro.value,
        bairro: iBairro.value,
        cidade: iCidade.value,
        estado: iEstado.value
    };

    if (idEditando) {
        atualizarPessoa(idEditando, pessoa);
    } else {
        cadastrarPessoa(pessoa);
    }

    form.reset();
    idEditando = null;
});

// CREATE
const cadastrarPessoa = (pessoa) => {
    fetch(urlApi, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(pessoa)
    })
        .then(res => res.json())
        .then(novaPessoa => {
            exibir(novaPessoa);
        });
};

// UPDATE 
const atualizarPessoa = (id, pessoa) => {
    fetch(`${urlApi}/${id}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(pessoa)
    })
        .then(res => res.json())
        .then(() => carregar());
};

// DELETE
const deletarPessoa = (id) => {
    fetch(`${urlApi}/${id}`, {
        method: 'DELETE'
    }).then(() => carregar());
};

// DADOS FORM
const editarPessoa = (pessoa) => {
    iNome.value = pessoa.nome;
    iCep.value = pessoa.cep;
    iLogradouro.value = pessoa.logradouro;
    iBairro.value = pessoa.bairro;
    iCidade.value = pessoa.cidade;
    iEstado.value = pessoa.estado;
    idEditando = pessoa.id;
};

// LIST
const exibir = (pessoa) => {
    const item = document.createElement('li');
    item.classList.add('list-group-item');

    item.innerHTML = `
        <strong>${pessoa.nome}</strong><br>
        ${pessoa.logradouro}, ${pessoa.bairro} - ${pessoa.cidade} / ${pessoa.estado}<br>
        CEP: ${pessoa.cep}<br>
        <button class="btn btn-sm btn-warning mt-2 me-2" onclick='editarPessoa(${JSON.stringify(pessoa)})'>Editar</button>
        <button class="btn btn-sm btn-danger mt-2" onclick="deletarPessoa('${pessoa.id}')">Excluir</button>
    `;

    listaUl.appendChild(item);
};

carregar();
