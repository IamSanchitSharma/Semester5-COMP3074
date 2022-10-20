
//http://zetcode.com/javascript/sequelize/
const Sequelize = require('sequelize');

const path = 'mysql://root:Gurukrupa@123@localhost:3306/db_sample';
const sequelize = new Sequelize(path, {
    operatorsAliases: false
});

let Dummy = sequelize.define('dummy', {
    description: Sequelize.STRING
});

Dummy.sync().then(() => {
    console.log('New table created');
}).finally(() => {
    sequelize.close();
})