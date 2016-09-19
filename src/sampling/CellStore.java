package sampling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CellStore{
	public int cellStoreId;
	public int core_partition_id = Integer.MIN_VALUE;
	public Set<Integer> support_partition_id = new HashSet<Integer>();
	public CellStore(int cellStoreId){
		this.cellStoreId = cellStoreId;
	}

	public String printCellStoreBasic(){
		String str = "";
		str += cellStoreId+",";
		str += "C:" + core_partition_id;
		return str;
	}
	public String printCellStoreWithSupport(){
		String str = "";
		str += cellStoreId+",";
		str += "C:" + core_partition_id+","+ "S:";
		for(Iterator itr = support_partition_id.iterator(); itr.hasNext();){ 
			int keyiter = (Integer) itr.next();
			str += keyiter+",";
		}
		return str.substring(0,str.length()-1);
	}
}