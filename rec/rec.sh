#!/bin/bash
info=$(ls -ld $1)
permr=${perm:7:1}
permw=${perm:8:1}
permx=${perm:9:1}
if [ $permr == "r" ]
then
echo "O arquivo/diretório $1 tem permissão de ler"
else
echo "O arquivo/diretório $1 não tem permissão de ler"
fi
then
if [ $permw == "w" ]
then
echo "O arquivo/diretório $1 tem permissão de escrever"
else
echo "O arquivo/diretório $1 não tem permissão de escrever"
fi
if [ $permw == "x" ]
then
echo "O arquivo/diretório $1 tem permissão para executar"
else
echo "O arquivo/diretório  $1 não tem permissão para executar"
fi
