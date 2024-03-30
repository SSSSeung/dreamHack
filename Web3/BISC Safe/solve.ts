import { Contract, JsonRpcProvider, } from "ethers";

(async () => {
  const provider = new JsonRpcProvider("https://sepolia.drpc.org")
  const abi = [
    {
      "inputs": [],
      "stateMutability": "nonpayable",
      "type": "constructor"
    },
    {
      "inputs": [
        {
          "internalType": "address",
          "name": "_owner",
          "type": "address"
        }
      ],
      "name": "changeOwner",
      "outputs": [],
      "stateMutability": "nonpayable",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "opensafe",
      "outputs": [
        {
          "internalType": "string",
          "name": "",
          "type": "string"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    },
    {
      "inputs": [],
      "name": "owner",
      "outputs": [
        {
          "internalType": "address",
          "name": "",
          "type": "address"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    }
  ];
  const contract = new Contract("0x5e992854Bd912ae170b7b5b8a64323e4e5E0feAF", abi, provider);

  // console.log(contract);
  console.log(await contract.owner());
  console.log(await contract.opensafe());
})().then(() => process.exit()).catch((e) => console.error);