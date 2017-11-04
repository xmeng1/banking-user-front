
Docker mysql 

```bash
// official need set port mapping
docker run --name learning-mysql -e MYSQL_ROOT_PASSWORD=Password123 -d mysql:latest

docker run -p 3306:3306 --name learning-mysql -e MYSQL_ROOT_PASSWORD=Password123 -d mysql:latest
```

