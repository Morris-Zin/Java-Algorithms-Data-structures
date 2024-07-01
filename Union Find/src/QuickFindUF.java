public class QuickFindUF {

  private int id[];

  QuickFindUF(int N) {
    id = new int[N];
    for (int index = 0; index < N; index++) {
      id[index] = index;
    }
  }

  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];

    for (int index = 0; index < id.length; index++) {
      if (id[index] == pid) {
        id[index] = qid;
      }
    }
  }
}
