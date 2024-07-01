public class weightedQuickUnion {

  private int id[];
  private int[] size;

  public weightedQuickUnion(int N) {
    size = new int[N];
    id = new int[N];

    for (int i = 0; i < N; i++) {
      id[i] = i;
      size[i] = 1;
    }
  }

  int root(int p) {
    while (p != id[p]) {
      // flatten the tree ? change the parent that the current node is pointing to to one level ahead
      id[p] = id[id[p]];
      p = id[p];
    }
    return p;
  }

  boolean isConnected(int p, int q) {
    return root(p) == root(q);
  }

  void union(int p, int q) {
    int proot = root(p);
    int qroot = root(q);

    if (proot == qroot) return;
    if (size[p] < size[q]) {
      id[proot] = qroot;
      size[qroot] += size[proot];
    } else {
      id[proot] = proot;
      size[proot] += size[qroot];
    }
  }
}
