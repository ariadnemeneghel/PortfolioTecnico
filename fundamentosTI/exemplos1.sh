#!/bin/bash
if [ $# -eq 0 ]
then
      echo "Digite um numero:"
      read x
      echo "Digite outro numero:"
      read y
      if [ $x -eq $y ];then
          echo "$x e  $y sao iguais."
     elif [ $x -gt $y ];then
          echo "$x e menor que $y."
      fi
else
      echo "parametros insuficientes"
fi
