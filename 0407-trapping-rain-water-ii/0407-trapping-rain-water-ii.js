/**
 * @param {number[][]} heightMap
 * @return {number}
 */ 
var trapRainWater = function(heightMap) {
        dx = [-1, 0, 1, 0];
        dy = [0, 1, 0, -1];

     if (!heightMap || !heightMap[0]) return 0;
        
        const m = heightMap.length;
        const n = heightMap[0].length;
        
        const pq = new MinPriorityQueue({ 
            priority: x => x[0] 
        });
        const visited = Array(m).fill().map(() => Array(n).fill(false));
        
        for (let j = 0; j < n; j++) {
            pq.enqueue([heightMap[0][j], 0, j]);
            pq.enqueue([heightMap[m-1][j], m-1, j]);
            visited[0][j] = visited[m-1][j] = true;
        }
        
        for (let i = 1; i < m-1; i++) {
            pq.enqueue([heightMap[i][0], i, 0]);
            pq.enqueue([heightMap[i][n-1], i, n-1]);
            visited[i][0] = visited[i][n-1] = true;
        }
        
        let water = 0;
        while (!pq.isEmpty()) {
            const [height, row, col] = pq.dequeue().element;
            
            for (let k = 0; k < 4; k++) {
                const newRow = row + dx[k];
                const newCol = col + dy[k];
                
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || 
                    visited[newRow][newCol]) continue;
                    
                if (heightMap[newRow][newCol] < height) {
                    water += height - heightMap[newRow][newCol];
                    pq.enqueue([height, newRow, newCol]);
                } else {
                    pq.enqueue([heightMap[newRow][newCol], newRow, newCol]);
                }
                visited[newRow][newCol] = true;
            }
        }
        return water;
};