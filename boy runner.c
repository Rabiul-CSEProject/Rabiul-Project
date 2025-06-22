#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>   // For _kbhit() and _getch() on Windows
#include <windows.h> // For Sleep()

#define WIDTH 50

void gotoxy(int x, int y) {
    COORD coord;
    coord.X = x;
    coord.Y = y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

int main() {
    int i, boyPos = 0, jump = 0;
    int obstaclePos = WIDTH - 1;
    int score = 0;
    srand(time(0));

    while (1) {
        system("cls"); // clear screen

        // Input handling
        if (_kbhit()) {
            char ch = _getch();
            if (ch == 'j' || ch == 'J') {
                jump = 1;
            }
        }

        // Display track
        for (i = 0; i < WIDTH; i++) {
            if (i == 0 && !jump) {
                printf("🏃"); // boy running
            } else if (i == 0 && jump) {
                printf("  ");
            } else if (i == 1 && jump) {
                printf("🏃"); // boy jumping
            } else if (i == obstaclePos) {
                printf("⬛"); // obstacle
            } else {
                printf(" ");
            }
        }
        printf(" | Score: %d\n", score);

        // Check for collision
        if (obstaclePos == 0 && !jump) {
            printf("💥 Game Over! Your score: %d\n", score);
            break;
        }

        // Update game state
        obstaclePos--;
        if (obstaclePos < 0) {
            obstaclePos = WIDTH - 1;
            score++;
        }

        // Reset jump
        if (jump) {
            jump = 0;
        }

        Sleep(100); // control speed
    }

    return 0;
}
