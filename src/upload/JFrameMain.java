package upload;

import javax.swing.*;

/**
 * @Auther: zhu hao
 * @since: 1.0.0
 * @Description:
 */
public class JFrameMain {


    public static void main(String[] args) {
//        Object[] possibleValues = {"开发人员", "测试人员/客户/现场"};
//        Object selectedValue = JOptionPane.showInputDialog(null, "请选择身份角色：",
//                "选择角色：", JOptionPane.INFORMATION_MESSAGE, null, possibleValues,
//                possibleValues[0]);
//        if ("开发人员".equals(selectedValue)) {
//            new Upload().UpLoadFile("上传文件", selectedValue);
//        }
        new Upload().UpLoadFile("上传文件", "开发人员");

    }
}
