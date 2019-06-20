## Fejlesztési környezet IDEA-ból történő indítása

```
docker-compose up
```

Az alkalmazás indításához IDEA-ban a **Run/Debug Configurations** beállításoknál a következő konfigurációs paramétert 
kell beállítani a **VM Options** értékének:
```
-Dspring.config.location=classpath:/,file:./config-other/dev/application.yaml
```

#### Adatbázis kapcsolódási adatok
Az alkalmazás user automatikusan létrejön a db konténer első elkészítésekor. Az adatbázis indulása után ez eltarthat egy kis ideig.
Amikor ```Grant succeeded.``` feliratokat látunk, utána már kapcsolódhatunk.

Az alkalmazás user addig él, ameddig az adatbázis tartalma.

**Adatbázis - alkalmazás user** (séma és adat szerkesztéshez a fejlesztőnek, alkalmazás usernek)
```
hostname: localhost
port: 1521
sid: xe
username: poc_user
password: poc_user
```

**Adatbázis - dba user** (Csak az alkalmazás user jogainak kezelésére használjuk.)
```
hostname: localhost
port: 1521
sid: xe
username: system
password: oracle
```

**Apex** (management felület) elérése: http://localhost:9090/apex
```
workspace: INTERNAL
user: ADMIN
password: oracle
```

## Camunda
#### Management felület (folyamatok, feladatok, stb..)
Bejelentkezés után
```
localhost:8080

user: admin
password: admin
```

#### Modeler
Vizuális folyamatszerkesztő letölthető innen: https://camunda.com/download/modeler/
