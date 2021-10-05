from collections import deque

n,m = map(int, input().split())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

# 상하좌우 방향정의
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    queue = deque()
    queue.append((x,y))

    while queue:
        x, y = queue.popleft()
        # 현재위치 기준 상하좌우 네 방향 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 미로 공간 범위
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            ## 공간 끝 범위 확인
            if graph[nx][ny] == 0:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    # 최종 graph종단의 위치한 count값
    return graph[n - 1][m - 1]


if __name__ == '__main__':
    print(bfs(0,0))