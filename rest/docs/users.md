## Пользователи

### Создать пользователя (зарегистрироваться)

Запрос:
```json
POST /api/users

{
   "username": "chuck",
   "password": "123456",
   "full_name": "Chuck Norris",
   "email": "chuck@me.to"
}
```

Ответ:
```json
{
  "__v": 0,
  "_id": "55ebbf4fc32d706a1e283c10",
  "created": "2015-09-06T04:21:35.453Z",
  "username": "chuck",
  "full_name": "Chuck Norris",
  "email": "chuck@me.to",
  "image_url": "/images/default_avatar.jpg"
}
```

### Получить текущего пользователя :lock:

Запрос:
```json
GET /api/users/profile
```

Ответ:
```json
{
  "_id": "55ea0a9f95164eb41cec6d51",
  "__v": 0,
  "created": "2015-09-04T21:18:23.681Z",
  "username": "mitro",
  "full_name": "Mitro",
  "email": "mitro@mitro.me",
  "image_url": "/images/default_avatar.jpg"
}
```
