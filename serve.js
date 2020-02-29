const { exec } = require('child_process');

const port = process.env.PORT || 3000;

exec(`serve -s -l ${port} ./resources/public`, { encoding: 'utf-8' });  // the default is 'buffer'

console.log(`Serving: http://localhost:${port}`)
