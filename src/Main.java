import java.util.ArrayList;
import java.util.List;

public class Main {

	List<Block> blockChain = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String[] genesisTransactions = {"krishna sent java 100 bitcoins"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		System.out.println("Genesis block hash: "+ genesisBlock.getBlockHash());
		
		String[] block1Transactions = {"jana sent krishna 10 bitcoins"};
		Block block1 = new Block(genesisBlock.getBlockHash(), block1Transactions);
		
		System.out.println("Block1 hash: "+ block1.getBlockHash());
		
		String[] block2Transactions = {"jana sent krishna 10 bitcoins"};
		Block block2 = new Block(block1.getBlockHash(), block2Transactions);
		
		System.out.println("Block2 hash: "+ block2.getBlockHash());

	}

}
