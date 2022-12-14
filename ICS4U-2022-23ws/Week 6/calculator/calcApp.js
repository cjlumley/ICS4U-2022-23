const keypadNumbers = [

    [7, 8, 9, '/'],

    [4, 5, 6, '*'],

    [1, 2, 3, '+'],

    [0, '.', '-'],

    ['CLS', '=']

];

const container = document.querySelector('#calculator');
const result = document.createElement('div');

keypadNumbers.forEach(keypadNumber => {
    keypadNumber.forEach(keyNumber => {
        const button = document.createElement('button');
        button.classList.add('key');
        if (keyNumber == 'CLS' || keyNumber == 0) {
            button.classList.add('wide-button-1');
        }
    if (keyNumber == '=') {
            button.classList.add('wide-button-2');
        }

        button.textContent = keyNumber;
        container.appendChild(button);
    });
});

result.classList.add('key');
result.classList.add('result');
container.appendChild(result);