(SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE 
WHERE TO_CHAR(SALES_DATE, 'YYYY-MM-DD') LIKE '%2022-03%'
)
UNION ALL

(SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE 
WHERE TO_CHAR(SALES_DATE, 'YYYY-MM-DD') LIKE'%2022-03%'
 )
ORDER BY 1,2,3