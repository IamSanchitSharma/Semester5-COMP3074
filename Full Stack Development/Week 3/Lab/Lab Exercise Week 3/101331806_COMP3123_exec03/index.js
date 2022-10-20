const { Console } = require("console");
var http = require("http");
//TODO - Use Employee Module here
var employees = require("./employee");

console.log("Lab 03 -  NodeJs");

//TODO - Fix any errors you found working with lab exercise

//Define Server Port
const port = process.env.PORT || 8081

//Create Web Server using CORE API
const server = http.createServer((req, res) => {
    if (req.method !== 'GET') {
        res.end(`{"error": "${http.STATUS_CODES[405]}"}`)
    } else {
        if (req.url === '/') {
            //TODO - Display message "<h1>Welcome to Lab Exercise 03</h1>"
            res.write("<h1>Welcome! to Lab Exercise 03</h1>")
        }

        if (req.url === '/employee') {
            //TODO - Display all details for employees in JSON format
            res.write(JSON.stringify(employees));
        }

        if (req.url === '/employee/names') {
            //TODO - Display only all employees {first name + lastname} in Ascending order in JSON Array
            //e.g. [ "Ash Lee", "Mac Mohan", "Pritesh Patel"]
            let employeeFullNameArray = [] ; 
            for ( let i = 0 ; i < employees.length ; i++ ) {
                // Pushing in all the first and last name pairs inside an array
                employeeFullNameArray.push(employees[i].firstName + ' ' + employees[i].lastName);   
            }
            employeeFullNameArray.sort();
            res.write(JSON.stringify(employeeFullNameArray));
        }
            
        if (req.url === '/employee/totalsalary') {
            //TODO - Display Sum of all employees salary in given JSON format 
            //e.g. { "total_salary" : 100 }
            let salarySum = 0;
            for(let i = 0; i < employees.length; i++){
                salarySum += employees[i].Salary;
            }
            res.write("Total Salary of all the employees is: " + JSON.stringify(salarySum));
        }
        res.end();  
    }
    
})

server.listen(port, () => {
    console.log(`Server listening on port ${port}`);
})