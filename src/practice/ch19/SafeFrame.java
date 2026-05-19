package practice.ch19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);		// 현재 시간 표시
    private TextArea textScreen = new TextArea(10, 60);	// 경비 센터 출력
    private Button buttonUse = new Button("금고 사용");	// 금고 사용 버튼
    private Button buttonAlarm = new Button("비상벨");	// 비상벨 버튼
    private Button buttonPhone = new Button("일반 통화");	// 일반 통화 버튼
    private Button buttonExit = new Button("종료");		// 종료 버튼

    //제일 중요한 속성: 상태 패턴의 현재 상태를 나타내는 변수
    private State state = DayState.getInstance();		// 현재 상태 
            // 부모 타입으로 선언
    // 생성자 
    public SafeFrame(String title) {
        super(title);   // 부모 생성자는 제일 첫 문장!!!
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // textClock 배치 
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);   // 편집이 안되도록 false
        // textScreen 배치 
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 패널에 버튼 저장
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 그 패널을 배치 
        add(panel, BorderLayout.SOUTH); // 패널을 프레임의 남쪽에 배치
        // 표시 
        pack();
        setVisible(true);
        // 리스너 설정 
        buttonUse.addActionListener(this);  // 아래서 if 문을 쓰면 비효율적...여기서 this 대신 람다 함수로 써줄 수 있음!!
        buttonAlarm.addActionListener(this);  // e -> state.doAlarm(this) 이런 식으로
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 버튼이 눌리면 여기로 온다
    @Override                       // 어떤 버튼이 눌렸는지에 대한 정보는 e에! (getSource에서 무슨 버튼인지 알려줌)
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {		// 금고 사용 버튼
            state.doUse(this);  // 현재 상태 객체에게 위임 (State 패턴에서 제일 중요!!) - 현재 상태가 주간이면 주간이 일하고/야간이면 야간이 일하고
        } else if (e.getSource() == buttonAlarm) {	// 비상벨 버튼 
            state.doAlarm(this);    // 현재 상태 객체에게 위임
        } else if (e.getSource() == buttonPhone) {	// 일반 통화 버튼  
            state.doPhone(this);    // 현재 상태 객체에게 위임
        } else if (e.getSource() == buttonExit) {	// 종료 버튼 
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 시간 설정 : 1초에 한 번씩 시계에서 호출한다
    @Override
    public void setClock(int hour) {    // 형식을 갖춘 출력 > String,format (%02d:00) - 2자리로 맞춰서 출력
        String clockstring = String.format("현재 시간은 %02d:00", hour);
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);  // 현재 상태 객체에게도 시간을 알려줌
    }

    // 상태 변화 
    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서" + state + "으로 상태가 변화했습니다.");
        this.state = state; // 현재 상태를 인자로 들어온 상태로 바꾼다
    }

    // 경비 센터 경비원 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 경비 센터 기록 
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
