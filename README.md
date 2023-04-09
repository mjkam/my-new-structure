## API

## 유저 조회

### Request

```
GET /user/{userId}
```

### Response

```
{
    "user": {
        "id": "long",
        "name": "string",
        "vipPoint": "int",
        "buyCount": "int"
    }
}
```

## 주문 생성

### Request

```
POST /order

{
    "userId": "long",
    "orderInfo": "string",
    "comment": "string"
}
```

```
{
    "user": {
        "id": "long",
        "name": "string",
        "vipPoint": "int",
        "buyCount": "int"
    },
    "order": {
        "id": "long",
        "orderUserId": "long",
        "orderInfo": "string",
        "comment": "string"
    },
    "randomEventNumber": "int"
}
```

## 주문 리스트 조회

### Request

```
GET /order?page=int&size=int

page: 1 ~ 10
size: 1 ~ 100
```

```
{
    "orders": [
        {
            "id": "long",
            "orderUserId": "long",
            "orderInfo": "string",
            "comment": "string"
        }, ...
    ]
}
```