import org.junit.jupiter.api.BeforeAll;
import org.web3j.EVMTest;
import org.web3j.NodeType;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
//import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@EVMTest(type = NodeType.GETH)
class Web3jTest {

    @BeforeAll
    public void main(String[] args) throws IOException {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
        String clientVersion = web3ClientVersion.getWeb3ClientVersion();

        System.out.println(clientVersion);
    }
}


