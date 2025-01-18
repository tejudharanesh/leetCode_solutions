/**
 * @param {number[][]} grid
 * @return {number}
 */
var minCost = function(grid) {
        const m = grid.length;
        const n = grid[0].length;
        const dist = Array.from({ length: m }, () => Array(n).fill(Infinity));
        const dq = [];
        dist[0][0] = 0;
        dq.push([0, 0]);
        const dx = [0, 0, 1, -1], dy = [1, -1, 0, 0];
        
        while (dq.length) {
            const [x, y] = dq.shift();
            const curDir = grid[x][y] - 1;
            for (let dir = 0; dir < 4; dir++) {
                const nx = x + dx[dir], ny = y + dy[dir];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    const cost = dist[x][y] + (dir === curDir ? 0 : 1);
                    if (cost < dist[nx][ny]) {
                        dist[nx][ny] = cost;
                        if (dir === curDir) {
                            dq.unshift([nx, ny]);
                        } else {
                            dq.push([nx, ny]);
                        }
                    }
                }
            }
        }
        return dist[m - 1][n - 1];
};