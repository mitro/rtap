## Аутентификация

### Логин

Запрос:
```json
POST /api/auth

{
   "username": "mitro",
   "password": "123456"
}
```
Ответ:

```json
{
  "__v": 0,
  "_id": "55ea0a9f95164eb41cec6d51",
  "created": "2015-09-04T21:18:23.681Z",
  "username": "mitro",
  "full_name": "Mitro",
  "email": "mitro@mitro.me",
  "image_url": "/images/default_avatar.jpg",
  "token": {
    "value": "asdasldmasd;mas;dmas;dlmas;ldma;slmdas;ldm",
    "expires": "2015-09-07T04:16:41.081Z"
  }
}
```
