import java.util.*;
public class TestArgWords {
	public static int one = 1;
	public static void main(String args[]){
		/*
		Map m = new HashMap();
		for(int i=0;i<args.length;i++){
			int freq = (Integer)m.get(args[i]) == null ? 0 :(Integer)m.get(args[i]);
			m.put(args[i],freq==0 ? one : freq + 1);
		}
		System.out.println(m);
		*/
		
		/*****
		���͵Ĳ�����Ҫ����Ϊ���Ͳ���ȷ
		1.װ�뼯�ϵ����Ͷ�������Object�Դ����Ӷ�ʧȥ�Լ���ʵ������
		2.�Ӽ�����ȡ��ʱ������Ҫת�ͣ�Ч�ʵͣ��ײ�������
		����ʹ��,ֱ��ָ���˶�������
		1.�ڶ��弯�ϵ�ͬʱ���弯�϶��������
		2.���ڶ���Collection���ƶ���Ҳ������ѭ��ʱ��Iterator�ƶ���
		****/
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(int i=0;i<args.length;i++){
			int freq = m.get(args[i]) == null ? 0 :m.get(args[i]);
			m.put(args[i],freq==0 ? one : freq + 1);
		}
		System.out.println(m);
	}
}