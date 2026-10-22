#!/usr/bin/env bash
logfile="access.log"
echo "Анализирую лог: ${logfile}"

total=$(wc -l < "${logfile}")
echo "Всего запросов: ${total}"

count_code(){
local code="$1"
local n=$(grep "${code}$" "${logfile}" | wc -l)
echo "Код ${code}: ${n}"
}

for code in 200 401 403 404 500; do
  count_code "$code"
done