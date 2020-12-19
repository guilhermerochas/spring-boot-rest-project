FROM postgres:13-alpine

WORKDIR /usr/project

ENV DB_DATABASE=postgres
ENV POSTGRES_PASSWORD=banco123
ENV POSTGRES_DB=projeto
ENV DB_PORT=5432

COPY ./data/people.sql /docker-entrypoint-initdb.d/

EXPOSE 5432