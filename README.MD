
## Docker mysql 

```bash
// official need set port mapping
docker run --name learning-mysql -e MYSQL_ROOT_PASSWORD=Password123 -d mysql:latest

docker run -p 3306:3306 --name learning-mysql -e MYSQL_ROOT_PASSWORD=Password123 -d mysql:latest
```

## Error of entityManagerFactory

```bash
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.class]: Invocation of init method failed; nested exception is javax.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory
```
    
Need to check the last cause:

```bash
Caused by: org.hibernate.MappingException: Could not determine type for: science.mengxin.banking.userfront.domain.PrimaryAccount, at table: primary_transaction, for columns: [org.hibernate.mapping.Column(primary_account)]
	at org.hibernate.mapping.SimpleValue.getType(SimpleValue.java:431) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.mapping.SimpleValue.isValid(SimpleValue.java:398) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.mapping.Property.isValid(Property.java:225) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.mapping.PersistentClass.validate(PersistentClass.java:595) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.mapping.RootClass.validate(RootClass.java:265) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.boot.internal.MetadataImpl.validate(MetadataImpl.java:329) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:443) ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:879) ~[hibernate-entitymanager-5.0.12.Final.jar:5.0.12.Final]
```

So the final reason:

I put the `@ManyToOne @JoinColumn(name = "primary_account_id")` at wrong place.
