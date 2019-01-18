package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IO_Operator {
	private List<IO_Operator> list = null;
	private String name = null;

	private Directory(String name) {
		this.name = name;
		list = new ArrayList<IO_Operator>();
	}

	public static Directory create(String name) {
		System.out.println(name + "フォルダ新規作成");
		return new Directory(name);
	}

	@Override
	public void remove() {
		for (IO_Operator io_Operator : list) {
			io_Operator.remove();
		}
		System.out.println(name + "フォルダ削除");
	}

	public void add(IO_Operator entry){
		list.add(entry);
	}

}
