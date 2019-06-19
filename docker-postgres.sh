#!/bin/bash
  
docker run --detach \
  --name postgres-db \
  --env POSTGRES_PASSWORD=Kri$hna_key12345 \
  --env POSTGRES_USER=postgres \
  --publish 5432:5432 \
  postgres:9.4.4