#!/bin/bash

curl https://start.spring.io/starter.zip \
  -d dependencies=web,devtools \
  -d type=gradle-project \
  -d language=java \
  -d groupId=com.marcos \
  -d artifactId=api \
  -d name=apis \
  -d description="consolidar o estudo de APIs com Spring" \
  -d packageName=com.marcos.api \
  -d javaVersion=17 \
  -d bootVersion=3.5.3 \
  -o word.zip


# Extrai o conteúdo do projeto e acessa a pasta gerada
unzip word.zip
cd word