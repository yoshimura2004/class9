 document.addEventListener('DOMContentLoaded', function() {
            // 더미 데이터 (Q&A.html의 allQnaData와 동일하게 유지)
            const allQnaData = [
                { id: '공지', title: '[공고 제2025-103호] 2026년도 과정형 평가 기준 변경 안내', attachment: true, department: '디지털정보과', date: '2024-11-15', views: 1115, content: '안녕하세요. 2026년도 과정형 평가 기준이 변경되어 안내드립니다. 자세한 내용은 첨부파일을 확인해주세요.' },
                { id: '공지', title: '[공고 제2025-102호] 시스템 점검 및 업데이트 안내', attachment: true, department: '시스템관리팀', date: '2024-11-10', views: 980, content: '안녕하세요. :Docswave 입니다.\n\n:Docswave 시스템 점검으로 서비스 이용이 잠시 중단 되오니 양해 부탁드립니다.\n\n- 시스템 점검일정 : 2020년 12월 5일(토) 오전 10시~\n(한시간 가량 소요 예정)\n\n※ 상기 점검 시간은 사정에 의해 변경될 수 있습니다.\n※ 예정된 시간에 완료될 수 있도록 최선을 다하겠습니다.\n\n감사합니다.\n;Docswave 올림' },
                { id: '공지', title: '[공고 제2025-101호] 개인정보처리방침 개정 안내', attachment: false, department: '법무팀', date: '2024-11-01', views: 1500, content: '개인정보처리방침이 개정되어 안내드립니다. 변경된 내용은 홈페이지를 통해 확인해주세요.' },
                { id: 65, title: '[공고 제2025-105호] 2025년 과정평가형 자격 시험 일정 공고', attachment: false, department: '자격관리부', date: '2024-10-28', views: 1234, content: '2025년 과정평가형 자격 시험 일정이 공고되었습니다. 자세한 내용은 첨부파일을 확인해주세요.' },
                { id: 64, title: '[공고 제2025-104호] 신규 케어메이트 교육 프로그램 모집', attachment: true, department: '교육훈련팀', date: '2024-10-25', views: 876, content: '신규 케어메이트 교육 프로그램에 참여할 분들을 모집합니다. 많은 관심 부탁드립니다.' },
                { id: 63, title: '[공고 제2025-103호] 케어메이트 활동 수당 지급 기준 변경 안내', attachment: false, department: '재무팀', date: '2024-10-20', views: 2100, content: '케어메이트 활동 수당 지급 기준이 변경되었습니다. 자세한 내용은 공지사항을 참고해주세요.' },
                { id: 62, title: '[공고 제2025-102호] 2025년 상반기 케어메이트 만족도 조사 결과', attachment: false, department: '서비스품질팀', date: '2024-10-18', views: 750, content: '2025년 상반기 케어메이트 만족도 조사 결과입니다. 여러분의 소중한 의견 감사합니다.' },
                { id: 61, title: '[공고 제2025-101호] 긴급 돌봄 서비스 이용 안내', attachment: true, department: '돌봄지원센터', date: '2024-10-10', views: 1800, content: '긴급 돌봄 서비스 이용에 대한 안내입니다. 위급 상황 시 활용해주세요.' },
                { id: 60, title: '[공고 제2025-100호] 케어메이트 자격 갱신 절차 안내', attachment: false, department: '자격관리부', date: '2024-10-05', views: 920, content: '케어메이트 자격 갱신 절차에 대해 안내드립니다. 기한 내에 갱신 바랍니다.' },
                { id: 59, title: '[공고 제2025-099호] 2025년 하반기 케어메이트 채용 설명회 개최', attachment: false, department: '인사팀', date: '2024-09-30', views: 600, content: '2025년 하반기 케어메이트 채용 설명회를 개최합니다. 많은 참여 바랍니다.' },
                { id: 58, title: '케어메이트 활동 보고서 제출 기한 안내', attachment: false, department: '디지털정보과', date: '2024-09-25', views: 550, content: '케어메이트 활동 보고서 제출 기한을 안내드립니다. 기한 내에 제출 바랍니다.' },
                { id: 57, title: '돌봄 서비스 이용 후기 이벤트 당첨자 발표', attachment: false, department: '서비스품질팀', date: '2024-09-20', views: 700, content: '돌봄 서비스 이용 후기 이벤트 당첨자를 발표합니다. 축하드립니다!' },
                { id: 56, title: '신규 돌봄 장비 도입 및 사용 교육 안내', attachment: true, department: '교육훈련팀', date: '2024-09-18', views: 480, content: '새로운 돌봄 장비가 도입되어 사용 교육을 진행합니다. 많은 참여 바랍니다.' },
                { id: 55, title: '지역사회 연계 프로그램 참여자 모집', attachment: false, department: '돌봄지원센터', date: '2024-09-15', views: 320, content: '지역사회 연계 프로그램에 참여할 분들을 모집합니다.' },
                { id: 54, title: '케어메이트 윤리 강령 준수 안내', attachment: false, department: '법무팀', date: '2024-09-10', views: 800, content: '케어메이트 윤리 강령 준수에 대한 안내입니다. 항상 윤리적인 활동 부탁드립니다.' },
                { id: 53, title: '2025년 케어메이트 역량 강화 워크숍 개최', attachment: false, department: '교육훈련팀', date: '2024-09-05', views: 400, content: '2025년 케어메이트 역량 강화를 위한 워크숍이 개최됩니다.' },
                { id: 52, title: '돌봄 서비스 만족도 향상을 위한 의견 수렴', attachment: false, department: '서비스품질팀', date: '2024-09-01', views: 250, content: '돌봄 서비스 만족도 향상을 위한 여러분의 소중한 의견을 수렴합니다.' },
                { id: 51, title: '케어메이트 휴가 및 대체 인력 신청 안내', attachment: false, department: '인사팀', date: '2024-08-28', views: 650, content: '케어메이트 휴가 및 대체 인력 신청에 대한 안내입니다.' },
                { id: 50, title: '건강 증진 프로그램 참여 독려', attachment: false, department: '돌봄지원센터', date: '2024-08-25', views: 380, content: '건강 증진 프로그램에 많은 참여 부탁드립니다.' },
                { id: 49, title: '2025년 케어메이트 정기 건강 검진 안내', attachment: true, department: '보건관리팀', date: '2024-08-20', views: 500, content: '2025년 케어메이트 정기 건강 검진에 대한 안내입니다.' },
                { id: 48, title: '돌봄 서비스 긴급 상황 대응 매뉴얼', attachment: false, department: '안전관리팀', date: '2024-08-15', views: 720, content: '돌봄 서비스 긴급 상황 발생 시 대응 매뉴얼입니다.' },
                { id: 47, title: '케어메이트 대상 심리 상담 지원 안내', attachment: false, department: '상담지원팀', date: '2024-08-10', views: 300, content: '케어메이트 분들을 위한 심리 상담 지원 안내입니다.' },
                { id: 46, title: '2025년 하반기 돌봄 서비스 수요 예측', attachment: false, department: '기획팀', date: '2024-08-05', views: 450, content: '2025년 하반기 돌봄 서비스 수요 예측 결과입니다.' },
                { id: 45, title: '케어메이트 우수 사례 공모전 개최', attachment: false, department: '홍보팀', date: '2024-08-01', views: 280, content: '케어메이트 우수 사례 공모전을 개최합니다. 많은 참여 바랍니다.' },
                { id: 44, title: '돌봄 서비스 관련 법규 변경 안내', attachment: false, department: '법무팀', date: '2024-07-28', views: 610, content: '돌봄 서비스 관련 법규가 변경되어 안내드립니다.' },
                { id: 43, title: '케어메이트 복지 혜택 확대 안내', attachment: false, department: '복지팀', date: '2024-07-25', views: 780, content: '케어메이트 복지 혜택이 확대됩니다. 자세한 내용은 공지사항을 확인해주세요.' },
                { id: 42, title: '2025년 상반기 재정 보고서 공개', attachment: false, department: '재무팀', date: '2024-07-20', views: 350, content: '2025년 상반기 재정 보고서가 공개되었습니다.' },
                { id: 41, title: '돌봄 서비스 개선을 위한 제안 접수', attachment: false, department: '서비스품질팀', date: '2024-07-15', views: 420, content: '돌봄 서비스 개선을 위한 여러분의 소중한 제안을 기다립니다.' },
                { id: 40, title: '케어메이트 안전 교육 의무화 안내', attachment: true, department: '안전관리팀', date: '2024-07-10', views: 900, content: '케어메이트 안전 교육이 의무화됩니다. 교육 이수 바랍니다.' },
                { id: 39, title: '지역 보건소 연계 건강 검진 안내', attachment: false, department: '보건관리팀', date: '2024-07-05', views: 530, content: '지역 보건소 연계 건강 검진에 대한 안내입니다.' },
                { id: 38, title: '케어메이트 활동 수당 정산 안내', attachment: false, department: '재무팀', date: '2024-06-30', views: 480, content: '케어메이트 활동 수당 정산에 대한 안내입니다.' },
                { id: 37, title: '돌봄 서비스 이용자 만족도 설문 조사', attachment: false, department: '서비스품질팀', date: '2024-06-25', views: 310, content: '돌봄 서비스 이용자 만족도 설문 조사를 실시합니다. 많은 참여 바랍니다.' },
                { id: 36, title: '신규 케어메이트 교육 과정 개설', attachment: true, department: '교육훈련팀', date: '2024-06-20', views: 670, content: '신규 케어메이트를 위한 교육 과정이 개설됩니다.' },
                { id: 35, title: '케어메이트 역량 강화 교육 프로그램', attachment: false, department: '교육훈련팀', date: '2024-06-15', views: 450, content: '케어메이트 역량 강화를 위한 교육 프로그램이 진행됩니다.' },
                { id: 34, title: '돌봄 서비스 이용자 권리 안내', attachment: false, department: '법무팀', date: '2024-06-10', views: 590, content: '돌봄 서비스 이용자 권리에 대한 안내입니다.' },
                { id: 33, title: '케어메이트 우수 활동 사례집 발간', attachment: false, department: '홍보팀', date: '2024-06-05', views: 220, content: '케어메이트 우수 활동 사례집이 발간되었습니다.' },
                { id: 32, title: '지역사회 돌봄 자원 연계 강화', attachment: false, department: '돌봄지원센터', date: '2024-06-01', views: 390, content: '지역사회 돌봄 자원 연계를 강화합니다.' },
                { id: 31, title: '2025년 예산 편성 및 집행 계획', attachment: false, department: '기획팀', date: '2024-05-28', views: 180, content: '2025년 예산 편성 및 집행 계획에 대한 안내입니다.' },
                { id: 30, title: '케어메이트 대상 직무 스트레스 관리 교육', attachment: false, department: '상담지원팀', date: '2024-05-25', views: 270, content: '케어메이트 분들을 위한 직무 스트레스 관리 교육이 진행됩니다.' },
                { id: 29, title: '돌봄 서비스 이용자 안전 수칙 안내', attachment: true, department: '안전관리팀', date: '2024-05-20', views: 760, content: '돌봄 서비스 이용자 안전 수칙에 대한 안내입니다. 숙지 바랍니다.' },
                { id: 28, title: '케어메이트 채용 공고 및 절차', attachment: false, department: '인사팀', date: '2024-05-15', views: 950, content: '케어메이트 채용 공고 및 절차에 대한 안내입니다.' },
                { id: 27, title: '2025년 상반기 사업 실적 보고', attachment: false, department: '기획팀', date: '2024-05-10', views: 410, content: '2025년 상반기 사업 실적 보고서입니다.' },
                { id: 26, title: '돌봄 서비스 이용자 개인정보 보호 강화', attachment: false, department: '법무팀', date: '2024-05-05', views: 630, content: '돌봄 서비스 이용자의 개인정보 보호를 강화합니다.' },
                { id: 25, title: '케어메이트 복지 증진 방안 모색', attachment: false, department: '복지팀', date: '2024-05-01', views: 340, content: '케어메이트 복지 증진 방안을 모색하고 있습니다.' },
                { id: 24, title: '지역사회 돌봄 네트워크 구축', attachment: false, department: '돌봄지원센터', date: '2024-04-28', views: 290, content: '지역사회 돌봄 네트워크를 구축합니다.' },
                { id: 23, title: '2025년 케어메이트 교육 과정 개편', attachment: true, department: '교육훈련팀', date: '2024-04-25', views: 580, content: '2025년 케어메이트 교육 과정이 개편됩니다.' },
                { id: 22, title: '돌봄 서비스 품질 관리 시스템 개선', attachment: false, department: '서비스품질팀', date: '2024-04-20', views: 370, content: '돌봄 서비스 품질 관리 시스템을 개선합니다.' },
                { id: 21, title: '케어메이트 활동 지원금 신청 안내', attachment: false, department: '재무팀', date: '2024-04-15', views: 700, content: '케어메이트 활동 지원금 신청에 대한 안내입니다.' },
                { id: 20, title: '돌봄 서비스 이용자 의견 반영', attachment: false, department: '서비스품질팀', date: '2024-04-10', views: 210, content: '돌봄 서비스 이용자 의견을 적극 반영하겠습니다.' },
                { id: 19, title: '케어메이트 직무 교육 의무화', attachment: false, department: '교육훈련팀', date: '2024-04-05', views: 490, content: '케어메이트 직무 교육이 의무화됩니다.' },
                { id: 18, title: '지역사회 연계 돌봄 서비스 확대', attachment: false, department: '돌봄지원센터', date: '2024-04-01', views: 330, content: '지역사회 연계 돌봄 서비스를 확대합니다.' },
                { id: 17, title: '2025년도 사업 계획 확정', attachment: false, department: '기획팀', date: '2024-03-28', views: 150, content: '2025년도 사업 계획이 확정되었습니다.' },
                { id: 16, title: '케어메이트 대상 법률 상담 지원', attachment: false, department: '법무팀', date: '2024-03-25', views: 260, content: '케어메이트 분들을 위한 법률 상담을 지원합니다.' },
                { id: 15, title: '돌봄 서비스 이용자 만족도 향상 방안', attachment: false, department: '서비스품질팀', date: '2024-03-20', views: 400, content: '돌봄 서비스 이용자 만족도 향상 방안을 모색합니다.' },
                { id: 14, title: '케어메이트 안전 교육 프로그램', attachment: true, department: '안전관리팀', date: '2024-03-15', views: 680, content: '케어메이트 안전 교육 프로그램이 진행됩니다.' },
                { id: 13, title: '지역 보건 협력 사업 추진', attachment: false, department: '보건관리팀', date: '2024-03-10', views: 310, content: '지역 보건 협력 사업을 추진합니다.' },
                { id: 12, title: '2025년 상반기 채용 설명회 개최', attachment: false, department: '인사팀', date: '2024-03-05', views: 550, content: '2025년 상반기 채용 설명회를 개최합니다.' },
                { id: 11, title: '돌봄 서비스 관련 민원 처리 안내', attachment: false, department: '고객지원팀', date: '2024-03-01', views: 470, content: '돌봄 서비스 관련 민원 처리에 대한 안내입니다.' },
                { id: 10, title: '케어메이트 활동 수칙 준수 강조', attachment: false, department: '법무팀', date: '2024-02-28', views: 620, content: '케어메이트 활동 수칙 준수를 강조합니다.' },
                { id: 9, title: '돌봄 서비스 이용자 의견 수렴 창구', attachment: false, department: '서비스품질팀', date: '2024-02-25', views: 240, content: '돌봄 서비스 이용자 의견 수렴 창구를 운영합니다.' },
                { id: 8, title: '신규 케어메이트 교육 프로그램 안내', attachment: true, department: '교육훈련팀', date: '2024-02-20', views: 710, content: '신규 케어메이트 교육 프로그램에 대한 안내입니다.' },
                { id: 7, title: '케어메이트 역량 강화 교육 신청', attachment: false, department: '교육훈련팀', date: '2024-02-15', views: 380, content: '케어메이트 역량 강화를 위한 교육 신청을 받습니다.' },
                { id: 6, title: '지역사회 돌봄 서비스 활성화 방안', attachment: false, department: '돌봄지원센터', date: '2024-02-10', views: 450, content: '지역사회 돌봄 서비스 활성화 방안을 모색합니다.' },
                { id: 5, title: '2025년도 사업 목표 설정', attachment: false, department: '기획팀', date: '2024-02-05', views: 190, content: '2025년도 사업 목표를 설정합니다.' },
                { id: 4, title: '케어메이트 대상 심리 지원 서비스', attachment: false, department: '상담지원팀', date: '2024-02-01', views: 300, content: '케어메이트 분들을 위한 심리 지원 서비스를 제공합니다.' },
                { id: 3, title: '돌봄 서비스 안전 관리 강화', attachment: true, department: '안전관리팀', date: '2024-01-28', views: 800, content: '돌봄 서비스 안전 관리를 강화합니다.' },
                { id: 2, title: '케어메이트 채용 절차 및 기준', attachment: false, department: '인사팀', date: '2024-01-25', views: 920, content: '케어메이트 채용 절차 및 기준에 대한 안내입니다.' },
                { id: 1, title: '2025년도 주요 사업 계획 발표', attachment: false, department: '기획팀', date: '2024-01-20', views: 600, content: '2025년도 주요 사업 계획을 발표합니다.' }
            ];

            const detailPageTitle = document.getElementById('detailPageTitle');
            const currentNoticeTitleBreadcrumb = document.getElementById('currentNoticeTitle');
            const noticeDetailTitle = document.getElementById('noticeDetailTitle');
            const noticeDetailDepartment = document.getElementById('noticeDetailDepartment');
            const noticeDetailDate = document.getElementById('noticeDetailDate');
            const noticeDetailViews = document.getElementById('noticeDetailViews');
            const noticeDetailContent = document.getElementById('noticeDetailContent');
            const noticeDetailAttachment = document.getElementById('noticeDetailAttachment');

            // URL에서 공지 ID 가져오기
            const urlParams = new URLSearchParams(window.location.search);
            const noticeId = urlParams.get('id'); // 'id' 파라미터 가져오기

            if (noticeId) {
                // ID에 해당하는 공지사항 찾기
                const notice = allQnaData.find(item => String(item.id) === noticeId); // id가 '공지'인 경우도 있으므로 String으로 변환하여 비교

                if (notice) {
                    detailPageTitle.textContent = notice.title; // 페이지 타이틀 업데이트
                    currentNoticeTitleBreadcrumb.textContent = notice.title; // Breadcrumb 업데이트
                    noticeDetailTitle.textContent = notice.title;
                    noticeDetailDepartment.textContent = notice.department;
                    noticeDetailDate.textContent = notice.date;
                    noticeDetailViews.textContent = `조회수: ${notice.views}`;
                    
                    // 내용에 줄바꿈 문자(\n)가 있으면 <br> 태그로 변환하여 표시
                    noticeDetailContent.innerHTML = notice.content.replace(/\n/g, '<br>');

                    if (notice.attachment) {
                        noticeDetailAttachment.innerHTML = `
                            <img src="https://via.placeholder.com/16x16?text=📄" alt="첨부파일 아이콘" style="vertical-align: middle;">
                            <span>첨부파일: ${notice.title.split(']')[0] || '파일'} (클릭 시 다운로드)</span>
                        `;
                        // 실제 다운로드 기능은 서버가 필요하므로 더미 링크로 표시
                        noticeDetailAttachment.style.cursor = 'pointer';
                        noticeDetailAttachment.onclick = () => {
                            console.log('첨부파일 다운로드 시도:', notice.title);
                            // alert('실제 파일 다운로드 기능은 서버 구현이 필요합니다.');
                        };
                    } else {
                        noticeDetailAttachment.innerHTML = '';
                    }
                } else {
                    // 공지사항을 찾을 수 없을 경우 처리
                    detailPageTitle.textContent = '공지사항을 찾을 수 없습니다.';
                    currentNoticeTitleBreadcrumb.textContent = '오류';
                    noticeDetailTitle.textContent = '공지사항을 찾을 수 없습니다.';
                    noticeDetailContent.textContent = '요청하신 공지사항을 찾을 수 없습니다. 목록으로 돌아가주세요.';
                    noticeDetailDepartment.textContent = '';
                    noticeDetailDate.textContent = '';
                    noticeDetailViews.textContent = '';
                }
            } else {
                // ID 파라미터가 없을 경우 처리
                detailPageTitle.textContent = '잘못된 접근입니다.';
                currentNoticeTitleBreadcrumb.textContent = '오류';
                noticeDetailTitle.textContent = '잘못된 접근입니다.';
                noticeDetailContent.textContent = '공지사항 ID가 제공되지 않았습니다. 목록으로 돌아가주세요.';
                noticeDetailDepartment.textContent = '';
                noticeDetailDate.textContent = '';
                noticeDetailViews.textContent = '';
            }
        });