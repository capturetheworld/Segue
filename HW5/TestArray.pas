PROGRAM TestArray;

TYPE
    vector = ARRAY[0..9] OF integer;
    matrix = ARRAY[0..4, 0..4] OF integer;
    cube   = ARRAY[1..2, -2..4, 3..6] OF integer;

VAR
    i, j, k, m, n : integer;
    a1         : vector;
    a2         : matrix;
    a3         : cube;

BEGIN
    i := 2; j := 0; k := 4; n := 2;
{
    m := a1[i];
    m := a2[i, j];
    m := a2[i][j];
    m := a3[i, j, k];
    m := a3[i][j][k];
    m := a3[i, j][k];
    m := a3[i][j, k];
}
{
    a1[i] := n;
    a2[i, j] := n;
    a2[i][j] := n;
    a3[i, j, k] := n;
    a3[i][j, k] := n;
    a3[i, j][k] := n;
    a3[i][j][k] := n;
}
    a3[i][a1[j]][k] := a2[i][j] - a3[k, 2*n][k+1];
END.
