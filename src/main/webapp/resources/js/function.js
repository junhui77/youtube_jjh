    const replyCnt = `${replyCount}`;
    console.log("replyCnt12223",replyCnt);

//홈화면 무한스크롤 영상 불러오기 함수
function getCommentNextList(num) {
    const criteria = $("#mainCriteria").val();
    const keyword = $("#mainKeyword").val();
    const searchType = $("#mainSearchType").val();
  
    console.log("length", $(".mycard").length);
  
    //console.log("criteria",criteria);
    //console.log("keyword",keyword);
    //console.log("searchType",searchType);
  
    if ($(".mycard").length >= replyCnt) {
      console.log("영상 불러오기 끝");
      return false;
    }
  
    $.ajax({
      url: `./boards/" + ${ boardDetail.num } + "/replies"`,
      type: "get",
      //async: false,
      data: {
        page: num,
      },
      datatype: "json", //없어도 됨
      success: function (result) {
        
        let list = "";
    //    for (item of result.list) {
            // for (let i = 1; i < 6; i++) {
 
 
             
          //   list += "<ul class=\"commentItem\" style=\"padding-left:0;\" data-id=\"" + item.replyIdx + "\">"
          // "<li class=\"list-group-item\">"
          //   list += "<div class=\"form-inline replyProfileImg mb-2\" ><img src=\"./resources/upload/" + item.filePath + "/" + item.fileUuid + item.fileName +"\" alt=\"test이미지\"></div>"
          //   //htmlStr += "<div class=\"form-inline mb-2\" > <img src=\"./resources/upload/${boardDetail.filePath}/${boardDetail.fileUuid}${boardDetail.fileName}\" alt=\"test이미지\"></div>"
          //   list += "<div class=\"form-inline replyProfileId  mb-2\" >" + item.memId + "</div>"
          //   list += "</div>"
          //   list += "<div class=\"replyCont\" style=\"font-size:14px;\">" + item.replyContent + "<span class=\"dateText\">&nbsp;&nbsp;" + item.replyRegdate + "</span></div>"
 
          //   list += "<input type=\"text\" id=\"modifyContent\" class=\" hide " + item.replyIdx + "  \" value=\"" + item.replyContent + "\" ></input>"
 
          //   list += "<button  type=\"button\"  class=\" mt-3 editEndBtn editEndBtn" + item.replyIdx + " hide \"  style=\"background-color:rgb(53, 134, 255); border:none\">수정 완료</button>"
 
          //    //if(${sesMemIdx} == memIdx){
 
          //    if (`${sesMemIdx}` == memIdx) {
          //       list += "<button  type=\"button\" class=\" mt-3 editBtn eventBlock\"  style=\"background-color:rgb(53, 134, 255); border:none\">수정</button>"
          //       list += "<button  type=\"button\" class=\" mt-3 deleteBtn eventBlock\"  style=\"background-color:rgb(110, 111, 166); border:none\">삭제</button>"
          //    }
 
          list += `<div class="col-lg-3 p-3">123</div>`;
 
 
            //  list += "</li>"
            //  list += "</ul>"
            
 
             //console.log("replyList.length:" + replyList.length);
            
 
          // }


       
  



        $("#commentList").append(list);
  
        flag = false;
        page++;
      },
    });
  }