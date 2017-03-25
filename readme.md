MongoDB M101J Course!
===================


Java project used for the M101J course.
The tech stack used is Java + Spark Web Framework+ Freemaker + MongoDB

----------


Docker
-------------

I will use a docker container with mongodb instead of installing it in my local computer.
For this, after having Docker installed run this command to create the container from the Dockerfile in the folder:

```bash
docker build -t <DockerHub_User>/M101JMongoServer .
 docker run --name MongoServer -d <DockerHub_User>/m101jmongoserver
```
After the instance is up and running (it will take some time to download the container the first time it is run), to open a terminal in the container run:
```bash
docker exec -it MongoServer bash
```
Then, the course commands to test the MongoDB instance can be run correctly.

---