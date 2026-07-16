//============================
// モックデータ
//============================

const allMembers = [
    "山田 太郎",
    "佐藤 花子",
    "鈴木 一郎",
    "高橋 健",
    "田中 美咲",
    "伊藤 誠",
    "渡辺 真"
];

const headquarters = [
    "営業本部",
    "開発本部",
    "総務本部",
    "管理本部",
    "人事本部"
];


//============================
// 共通
//============================

const modal = document.getElementById("modal");
const modalTitle = document.getElementById("modalTitle");
const modalBody = document.getElementById("modalBody");

const saveModal = document.getElementById("saveModal");
const cancelModal = document.getElementById("cancelModal");

let saveCallback = null;


//============================
// モーダル表示
//============================

function openModal(title, body, callback){

    modalTitle.textContent = title;

    modalBody.innerHTML = "";

    modalBody.appendChild(body);

    saveCallback = callback;

    modal.style.display = "flex";

}


//============================
// モーダルを閉じる
//============================

function closeModal(){

    modal.style.display = "none";

    modalBody.innerHTML = "";

}


//============================
// 保存
//============================

saveModal.addEventListener("click",()=>{

    if(saveCallback){

        saveCallback();

    }

    closeModal();

});


//============================
// キャンセル
//============================

cancelModal.addEventListener("click",closeModal);


//============================
// ESC
//============================

document.addEventListener("keydown",(e)=>{

    if(e.key==="Escape"){

        closeModal();

    }

});


//============================
// 背景クリック
//============================

modal.addEventListener("click",(e)=>{

    if(e.target===modal){

        closeModal();

    }

});


const managerBtn =
document.getElementById("editManagerBtn");


managerBtn.addEventListener("click",()=>{

    const wrapper = document.createElement("div");


    wrapper.innerHTML = `

<h3>管理者検索</h3>

<input
type="text"
placeholder="名前を入力">

<br><br>

<button>検索</button>

<hr>

<h3>現在の管理者</h3>

<ul id="modalManagerList">

<li>山田 太郎</li>
<li>佐藤 花子</li>
<li>鈴木 一郎</li>

</ul>

<button>追加</button>

<button>削除</button>

`;

    openModal("管理者編集",wrapper,()=>{

        alert("管理者保存");

    });

});

document
.getElementById("editHeadquartersBtn")
.addEventListener("click",()=>{


const wrapper=document.createElement("div");


wrapper.innerHTML=`

<label>

<input type="checkbox" checked>

営業本部

</label>

<br>

<label>

<input type="checkbox">

管理本部

</label>

<br>

<label>

<input type="checkbox" checked>

開発本部

</label>

<br>

<label>

<input type="checkbox">

総務本部

</label>

`;

openModal("公開先編集",wrapper,()=>{

alert("公開先保存");

});


});


document
.getElementById("editStartDateBtn")
.addEventListener("click",()=>{

const wrapper=document.createElement("div");

const input=document.createElement("input");

input.type="date";

input.value="2026-07-15";

wrapper.appendChild(input);

openModal("開始日編集",wrapper,()=>{

document
.getElementById("startDate")
.textContent=input.value;

});

});


document
.getElementById("editEndDateBtn")
.addEventListener("click",()=>{

const wrapper=document.createElement("div");

const input=document.createElement("input");

input.type="date";

input.value="2026-08-31";

wrapper.appendChild(input);

openModal("終了日編集",wrapper,()=>{

document
.getElementById("endDate")
.textContent=input.value;

});

});


document
.getElementById("editSurveyBtn")
.addEventListener("click",()=>{

const wrapper=document.createElement("div");

wrapper.innerHTML=`

<label>

アンケート名

</label>

<input
id="editTitle"
type="text"
value="社員満足度アンケート">

<br><br>

<label>

説明

</label>

<textarea
id="editDescription"
rows="5">

本アンケートは社員満足度を把握する目的で実施します。

</textarea>

`;

openModal("アンケート情報編集",wrapper,()=>{

const title=
document
.getElementById("editTitle")
.value;

const desc=
document
.getElementById("editDescription")
.value;

document
.getElementById("surveyTitle")
.textContent=
"アンケート名："+title;

document
.getElementById("surveyDescription")
.textContent=
"説明："+desc;

});

});

const questions = document.getElementById("questions");

const confirmModal =
document.getElementById("confirmModal");

const confirmDelete =
document.getElementById("confirmDelete");

const cancelDelete =
document.getElementById("cancelDelete");

let deleteTarget = null;

let questionCount = 0;


createQuestionCard("single");

document
.getElementById("addQuestionBtn")
.addEventListener("click",()=>{

    const type =
    document.querySelector(
        "input[name='questionType']:checked"
    ).value;

    createQuestionCard(type);

});


function createQuestionCard(type){

    questionCount++;

    const card =
    document.createElement("div");

    card.className="question-card";

    card.dataset.type=type;

    let choicesHTML="";

    if(type!=="text"){

        choicesHTML=`

<div class="choices">

</div>

<button class="add-choice">

選択肢追加

</button>

`;

    }

    card.innerHTML=`

<div class="question-header">

<h3>

質問${questionCount}

</h3>

<div>

<label>

<input type="checkbox">

必須回答

</label>

<button class="delete-question">

質問削除

</button>

</div>

</div>

<div class="question-body">

<div class="form-row">

<label>

質問文

</label>

<input type="text">

</div>

<div class="form-row">

<label>

補足説明

</label>

<textarea rows="3"></textarea>

</div>

${choicesHTML}

</div>

`;

    questions.appendChild(card);

    if(type!=="text"){

        const choices =
        card.querySelector(".choices");

        addChoice(choices);

        addChoice(choices);

        addChoice(choices);

    }

    bindCard(card);

}


function addChoice(container){

    const count =
    container.children.length+1;

    const row =
    document.createElement("div");

    row.className="choice-row";

    row.innerHTML=`

<label>

選択肢${count}

</label>

<input type="text">

<button class="remove-choice">

削除

</button>

`;

    container.appendChild(row);

}


function bindCard(card){

    const addButton =
    card.querySelector(".add-choice");

    if(addButton){

        addButton.addEventListener("click",()=>{

            addChoice(
                card.querySelector(".choices")
            );

        });

    }

    card
    .querySelector(".delete-question")
    .addEventListener("click",()=>{

        deleteTarget=card;

        confirmModal.style.display="flex";

    });

}


document.addEventListener("click",(e)=>{

    if(
        e.target.classList.contains(
            "remove-choice"
        )
    ){

        e.target.parentElement.remove();

    }

});


confirmDelete.addEventListener("click",()=>{

    if(deleteTarget){

        deleteTarget.remove();

    }

    confirmModal.style.display="none";

});

cancelDelete.addEventListener("click",()=>{

    confirmModal.style.display="none";

});

confirmModal.addEventListener("click",(e)=>{

    if(e.target===confirmModal){

        confirmModal.style.display="none";

    }

});

document.addEventListener("keydown",(e)=>{

    if(e.key==="Escape"){

        confirmModal.style.display="none";

    }

});


function getSurveyData(){

    const survey = {

        title:
        document
            .getElementById("surveyTitle")
            .textContent,

        description:
        document
            .getElementById("surveyDescription")
            .textContent,

        startDate:
        document
            .getElementById("startDate")
            .textContent,

        endDate:
        document
            .getElementById("endDate")
            .textContent,

        managers:
        [...document.querySelectorAll("#managerList li")]
            .map(li=>li.textContent),

        headquarters:
        [...document.querySelectorAll("#publishList li")]
            .map(li=>li.textContent),

        questions:[]
    };

    document
    .querySelectorAll(".question-card")
    .forEach(card=>{

        const q={

            required:
            card.querySelector(
                "input[type='checkbox']"
            ).checked,

            title:
            card.querySelector(
                "input[type='text']"
            ).value,

            description:
            card.querySelector(
                "textarea"
            ).value,

            type:
            card.dataset.type,

            choices:[]
        };

        card
        .querySelectorAll(".choice-row input")
        .forEach(input=>{

            q.choices.push(input.value);

        });

        survey.questions.push(q);

    });

    return survey;

}


managerBtn.addEventListener("click",()=>{

    const wrapper=document.createElement("div");

    wrapper.innerHTML=`

<input id="managerSearch">

<button id="searchBtn">

検索

</button>

<hr>

<div id="searchResult"></div>

<hr>

<h3>

現在の管理者

</h3>

<ul id="modalManagerList">

</ul>

`;

    const modalList=
    wrapper.querySelector("#modalManagerList");

    document
    .querySelectorAll("#managerList li")
    .forEach(li=>{

        const item=document.createElement("li");

        item.textContent=li.textContent;

        item.style.cursor="pointer";

        item.onclick=()=>item.remove();

        modalList.appendChild(item);

    });

    openModal("管理者編集",wrapper,()=>{

        const list=
        document.getElementById("managerList");

        list.innerHTML="";

        modalList
        .querySelectorAll("li")
        .forEach(li=>{

            list.appendChild(li.cloneNode(true));

        });

    });

    wrapper
    .querySelector("#searchBtn")
    .onclick=()=>{

        const keyword=
        wrapper
        .querySelector("#managerSearch")
        .value;

        const result=
        wrapper
        .querySelector("#searchResult");

        result.innerHTML="";

        allMembers
        .filter(name=>name.includes(keyword))
        .forEach(name=>{

            const div=document.createElement("div");

            div.textContent=name;

            div.style.cursor="pointer";

            div.onclick=()=>{

                const li=document.createElement("li");

                li.textContent=name;

                li.onclick=()=>li.remove();

                modalList.appendChild(li);

            };

            result.appendChild(div);

        });

    };

});



document
.getElementById("editHeadquartersBtn")
.onclick=()=>{

    const wrapper=document.createElement("div");

    headquarters.forEach(name=>{

        const label=document.createElement("label");

        label.innerHTML=`

<input type="checkbox">

${name}

`;

        wrapper.appendChild(label);

        wrapper.appendChild(document.createElement("br"));

    });

    openModal("公開先編集",wrapper,()=>{

        const ul=
        document.getElementById("publishList");

        ul.innerHTML="";

        wrapper
        .querySelectorAll("input")
        .forEach((input,index)=>{

            if(input.checked){

                const li=document.createElement("li");

                li.textContent=headquarters[index];

                ul.appendChild(li);

            }

        });

    });

};


document
.querySelector(".bottom-buttons")
.children[0]
.onclick=()=>{

    if(confirm("入力内容を破棄しますか？")){

        location.reload();

    }

};


document
.querySelector(".bottom-buttons")
.children[1]
.onclick=()=>{

    console.log(getSurveyData());

    alert("一時保存しました");

};


document
.querySelector(".bottom-buttons")
.children[2]
.onclick=()=>{

    console.log(getSurveyData());

    alert("保存しました");

};

