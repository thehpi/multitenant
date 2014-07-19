#!/bin/bash

for i in {1..100}
do
	{ time curl -s localhost:8080/multitenant/projects/TestBean$i >$i.out ; } 2> $i.time &
done 
