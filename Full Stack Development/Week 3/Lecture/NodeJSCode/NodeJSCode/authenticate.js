const Sequelize = require('sequelize');

const path = 'mysql://root:Gurukrupa@123@localhost:3306/db_sample';
const sequelize = new Sequelize(path, { operatorsAliases: false });

sequelize.authenticate().then(() => {
  console.log('Connection established successfully.');
}).catch(err => {
  console.error('Unable to connect to the database:', err);
}).finally(() => {
  sequelize.close();
});