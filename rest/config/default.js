export default {
  server: {
    ip: '0.0.0.0',
    port: parseInt(process.env.PORT, 10) || 8080
  },
  mongodb: {
    host: 'localhost',
    database: 'rtap'
  },
  secret: 'ifyouwannabeoksaythisphraseeveryday',
  jwt: {
    expires: 1440
  },
  proxy: {
    violations: {
      url: 'http://127.0.0.1:9080/violations'
    }
  }
};
