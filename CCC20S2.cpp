#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class Cell {
	public:
	int r;
	int c;
};

bool visited[1000][1000];
vector<vector<Cell>> cell_vals(1000000);

string try_exit(Cell last_cell) {
	queue<Cell> q;
	q.push(last_cell);
	while (q.size() > 0) {
		Cell currentCell = q.front();
		q.pop();
		vector<Cell> neighbour = cell_vals[currentCell.r * currentCell.c]; //finds all cells that can jump to
		for (int i = 0; i < neighbour.size(); i++) {
			if (neighbour[i].r == 1 && neighbour[i].c == 1) { //if its location is 1,1 then we have reached the begining and exit is possible
				return "yes";
			} else if (!visited[neighbour[i].r][neighbour[i].c]) {
				visited[neighbour[i].r][neighbour[i].c] = true;
				q.push(neighbour[i]);
			}
		}
	}
	return "no";
}

int main() {
	int m, n;
	cin >> m >> n;
	Cell last_cell;
	last_cell.r = m;
	last_cell.c = n;
	for (int i = 1; i < m+1; i++) {
		for (int j = 1; j < n+1; j++) {
			int cell_val;
			cin >> cell_val;
			Cell temp_cell;	
			temp_cell.r = i;
			temp_cell.c = j;
			cell_vals[cell_val].push_back(temp_cell);
		}
	}
	cout << try_exit(last_cell);
	return 0;
}