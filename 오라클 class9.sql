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

-- 5.13 복습 활용

-- 급여가 3000만원 미만이고, 판매원인 사람을 출력하시오

select * from emp
    where sal < 3000 and job = 'SALESMAN'; 

-- 급여가 3000만원 미만이고, 판매원인 직원의 사원번호를 오름차순으로 정렬하시오.

select * from emp
    where sal < 3000 and job = 'SALESMAN'
    order by empno;

-- 부서번호가 10 혹은 20이고, 급여가 2000이상인 사원의 사번을 내림차순으로 정렬하시오.

select * from emp
    where sal >= 2000 and deptno in(10,20)
    order by empno desc;
    
-- 부서번호가 10과 20이 아니며, 급여가 3000 미만인 사원의 입사일을 오름차순으로 정렬하시오.

select * from emp
    where sal < 3000 and not deptno in (10, 20)
    order by hiredate;

--   5.14 start 
--1번
select * from emp
    where deptno = 10;
--2번
select * from emp 
    where not deptno = 10;
--3번
select * from emp
 where sal >= 3000;
--4번
select * from emp
    where sal between 1500 and 3000;
--5번
select * from emp
    where  sal >= 2000 and deptno = 10;
--6번
select * from emp
    where sal > 1500 and sal < 3000 and deptno = 30;
--선생님 답변 괄호를 쓸 수 있을 때는 괄호를 사용하는게 가독성이 좋다.
select * from emp
    where deptno = 30
    and (sal > 1500 and sal < 3000);
--7번
select * from emp
    where sal > 1500 and sal < 3000 and deptno = 30
    order by sal;
--8번
select * from emp
    where sal > 1500 and sal < 3000 and deptno in (20,30)
    order by sal;
-- 같은 컬럼이 = 혹은 or로 연결되어 있는 경우 in으로 변경할 수 있다.
--9번
select ename, sal from emp
    where sal >= 1500 and deptno in ( 20, 30 )
    order by sal, ename;
-- 원래 푸는 방식, between을 사용하지 않을 경우
select * from emp
    where sal >= 1500 and sal <= 3000 and deptno in(20,30)
    order by sal;



    
    
    