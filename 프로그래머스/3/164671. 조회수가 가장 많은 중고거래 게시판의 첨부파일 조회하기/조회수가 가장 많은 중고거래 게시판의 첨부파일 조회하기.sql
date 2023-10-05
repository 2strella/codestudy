SELECT
    '/home/grep/src/' || T2.board_id || '/' || T2.file_id || T2.file_name || T2.file_ext AS FILE_PATH
FROM (SELECT
    board_id
FROM USED_GOODS_BOARD
WHERE VIEWS = (SELECT
    MAX(VIEWS)
FROM USED_GOODS_BOARD) ) T1, USED_GOODS_FILE T2
WHERE T1.board_id = T2.board_id
ORDER BY T2.FILE_ID DESC