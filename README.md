# Road Traffic Auto Portal
Портал автомобилиста

## Ручная установка

### Предварительная настройка

1. Установите node.js v0.12

  Установка node.js v0.12 на Ubuntu описывается [здесь](http://askubuntu.com/questions/586671/installing-node-js-through-a-ppa-does-not-fetch-the-latest-version/586674#586674)

2. Установите глобальные npm-пакеты

  `sudo npm install -g gulp nodemon babel`

3. Отредактируйте hosts, чтобы использовать удобный локальный URL-адрес rtap.dev

  `echo "127.0.0.1 rtap.dev" >> /etc/hosts`

### Установка api-приложения

1. Установите mongodb 3.0

  Установка mongodb 3.0 на Ubuntu описывается [здесь](http://docs.mongodb.org/master/tutorial/install-mongodb-on-ubuntu/)

2. Находясь в корневой папке проекта, перейдите в директорию с api-приложением

  `cd rest`

3. Установите зависимости api-приложения

  `npm install`

4. Запустите сервер api-приложения

  `gulp dev`

5. Проверьте работоспособность api-приложения

  Перейдите по ссылке [http://rtap.dev:8080/](http://rtap.dev:8080/api/status).
  Вы должны увидеть информационное сообщение.

### Установка web-приложения

1. Находясь в корневой папке проекта, перейдите в директорию с web-приложением

  `cd web`

2. Установите зависимости web-приложения

  `npm install`

3. Запустите сервер web-приложения

  `gulp dev`

4. Проверьте работоспособность web-приложения

  Перейдите по ссылке [http://rtap.dev:3000/](http://rtap.dev:3000).
  Должна отобразиться главная страница приложения.