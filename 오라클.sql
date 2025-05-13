-- sal 컬럼을 기준으로 오름차순 -작은것 부터 큰 것으로
select * from emp
order by sal;

select * from emp
order by sal asc;

-- sal 컬럼 기준으로 내림차순 - 큰 것 부터
select * from emp
order by sal desc;

select * from emp
order by hiredate asc;

select * from emp
order by ename asc;

select * from emp
order by job asc;

select * from emp
order by sal asc;

select * 
    from emp
order by deptno asc, sal desc;
-- depento asc, sal desc; 이 상황에서 연봉이 같은 애들 사원번호로 내림차순 정렬하시오.

-- 부서번호로 오름차순, 겹치면 sal 내림차순

select * from emp
    where deptno = 30;
    
-- sal이 1600인 사람만 출력

select * from emp
where sal = 1600;

-- 크다는 항상 왼 쪽 기호 기준 >
--작다는 항상 오른 쪽 기호 기준 <

select * from emp
where sal >= 1600; 

select * from emp
where sal <= 1600;

-- 부정

select * from emp
where deptno != 30;

select * from emp
where deptno <> 30;

-- and 절

select * from emp
    where deptno = 30
    and job = 'SALESMAN';
    
-- or
/*
    emp 테이블에서 사무번호가 30이거나(또는) 직책이 일반사원의 정보를 모두 알려주세요
*/

select * from emp
    where deptno = 30
    or job = 'CLERK';

/*
    job이 clerk이거나 sal이 2000 초과이며, deptno가 10인 사원 조회
*/
select * from emp
    where (job = 'CLERK'
    or sal > 2000) and deptno = 10;
/*
    deptno != 30 === deptno <> 30 === deptno ^= 30 not deptno = 30
*/

-- 월급 2000이상 4000미만인 사원을 출력하시오

select * from emp
    where sal >= 2000 and sal < 4000; 

-- 부서번호 10 혹은 20인 사원만 출력

select * from emp
    where deptno not in (10,20);

    
    
    
    