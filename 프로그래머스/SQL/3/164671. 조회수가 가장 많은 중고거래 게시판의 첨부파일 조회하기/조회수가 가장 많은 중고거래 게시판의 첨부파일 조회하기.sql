SELECT
    '/home/grep/src/' || F.board_id || '/' || F.file_id || F.file_name || F.file_ext AS FILE_PATH
FROM (SELECT
        board_id
      FROM USED_GOODS_BOARD
      WHERE VIEWS = (SELECT
                        MAX(VIEWS)
                     FROM USED_GOODS_BOARD) 
     ) B, USED_GOODS_FILE F
WHERE B.board_id = F.board_id
ORDER BY F.FILE_ID DESC;
