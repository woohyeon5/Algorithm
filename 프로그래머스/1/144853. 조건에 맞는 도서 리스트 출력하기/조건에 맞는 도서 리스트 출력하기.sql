-- 코드를 입력하세요 TO_CHAR(HIRE_YMD, 'YYYY-MM-DD')
SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD')
FROM BOOK 
WHERE CATEGORY LIKE '인문' AND TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') LIKE '%2021%'
ORDER BY PUBLISHED_DATE