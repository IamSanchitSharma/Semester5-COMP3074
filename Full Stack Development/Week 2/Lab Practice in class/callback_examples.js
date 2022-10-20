console.log("Welcome to Week 2 lab");

function greet(){
    return "Hello World!";
}
// Arrow form
greet = () => {
    return "Hi World!";
}
// Remove function 
// Parenthsis for the parameters
// Curly braces

function sayHello(name){
    return `Hello! ${name}. How are you?`;
}

sayHello = name =>{
    return `Hello ${name}!. Kida?`;
}

// IF THERE IS SINGLE STATEMENT YOU CAN REMOVE THE CRULY BRACES

sayHello = name => `Hello ${name}!. Ki haal chal?`;
// Can even remove the RETURN keyword


// CALLBACK

callback = (a,b) => a + b;
function cal_salary(a, b, callback){
    return callback(a,b);
}

console.log("Salary: " + cal_salary(100, 50, callback));

cal_salary(10, 5, function(a,b){
    return a+b;
}, (value) => {})