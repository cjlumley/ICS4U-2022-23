
// join
let fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
console.log(fruits.join());
console.log(fruits.join('--'));

// push
fruits.push('Kiwi');
console.log(fruits.join());
// pop

// shift

// unshift

// concat

// slice
fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
let citrus = fruits.slice(3);

fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
citrus = fruits.slice(1, 3);


// splice
fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi");

fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 2, "Lemon", "Kiwi");