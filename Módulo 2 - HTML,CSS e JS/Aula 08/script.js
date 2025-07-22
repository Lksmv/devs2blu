const urlApi = 'http://localhost:3000/pessoa';

const form = document.getElementById('form');
const listaUl = document.getElementById('listaUL');
const btn = document.getElementById('btn');

const iIdade = document.getElementById('idade');
const iNome = document.getElementById('nome');

let idEditando = null;

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
        idade: iIdade.value
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
    iIdade.value = pessoa.idade;
    idEditando = pessoa.id;
};

// LIST
const exibir = (pessoa) => {
    const item = document.createElement('li');
    item.classList.add('list-group-item');

    item.innerHTML = `
        <strong>${pessoa.nome}</strong><br>
        Idade: ${pessoa.idade}<br>
        <button class="btn btn-sm btn-warning mt-2 me-2" onclick='editarPessoa(${JSON.stringify(pessoa)})'>Editar</button>
        <button class="btn btn-sm btn-danger mt-2" onclick="deletarPessoa('${pessoa.id}')">Excluir</button>
    `;

    listaUl.appendChild(item);
};

carregar();
