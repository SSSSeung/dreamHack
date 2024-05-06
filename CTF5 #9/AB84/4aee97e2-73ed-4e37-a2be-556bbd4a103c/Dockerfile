FROM ubuntu:22.04@sha256:965fbcae990b0467ed5657caceaec165018ef44a4d2d46c7cdea80a9dff0d1ea

RUN apt update
RUN apt-get install -y socat python3 python3-pip
RUN pip install pycryptodome qiskit


COPY ./deploy/flag /flag
COPY ./deploy/prob.py /prob.py

RUN chmod 755 /flag /prob.py

EXPOSE 1111

CMD socat TCP-LISTEN:1111,reuseaddr,fork EXEC:/prob.py